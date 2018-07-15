<?import javafx.geometry.Insets?>
<?import javafx.scene.layout.GridPane?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.FlowPane?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.control.RadioButton?>
<?import javafx.scene.control.ToggleGroup?>
<?import javafx.scene.control.CheckBox?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.control.ToggleButton?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.control.PasswordField?>
<?import javafx.scene.control.ComboBox?>
<?import javafx.collections.FXCollections?>
<?import java.lang.String?>
<GridPane fx:controller="sample.Controller"
          xmlns:fx="http://javafx.com/fxml" >

       <Button GridPane.rowIndex="0" GridPane.columnIndex="0"   text="Click on me">

       </Button>
    <Label  GridPane.rowIndex="0" GridPane.columnIndex="1" text="I am her " textFill="darkgreen" wrapText="true" >
        <font>
            <Font name="Arial italic" size="20"   />
        </font>
    </Label>
    <fx:define>
        <ToggleGroup fx:id="ooglegroup" />
    </fx:define>
    <VBox GridPane.columnIndex="3">
     <RadioButton GridPane.columnIndex="0"   text="red" toggleGroup="$ooglegroup"/>
    <RadioButton GridPane.columnIndex="0"  text="green" toggleGroup="$ooglegroup" selected="true"/>
    <RadioButton GridPane.columnIndex="0"   text="blue" toggleGroup="$ooglegroup"/>
    </VBox>
<VBox GridPane.columnIndex="4">

    <CheckBox text="ILL"   />
    <CheckBox text="HEALTHY"   />
    <CheckBox text="MAIMED"   />
</VBox>
    <HBox GridPane.columnIndex="5">
        <ToggleButton text="t_button_1"/>
        <ToggleButton text="t_button_2"/>
        <ToggleButton text="t_button_3"/>
    </HBox>
<TextField GridPane.rowIndex="1" GridPane.columnIndex="0"/>
<PasswordField GridPane.rowIndex="1" GridPane.columnIndex="1"/>
    <ComboBox GridPane.rowIndex="1" GridPane.columnIndex="2" GridPane.columnSpan="3">
        <items>

            <FXCollections fx:factory="observableArrayList">
                <String fx:value="This is first option"/>
                <String fx:value="This is second option"/>
                <String fx:value="This is thirth option"/>
                <String fx:value="This is fourth option"/>

            </FXCollections>

        </items>
        <value>
            <String value="This is second option"/>
        </value>
    </ComboBox>
</GridPane>
