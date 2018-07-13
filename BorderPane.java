<?import javafx.geometry.Insets?>
<?import javafx.scene.layout.GridPane?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.BorderPane?>
<BorderPane fx:controller="sample.Controller"
            xmlns:fx="http://javafx.com/fxml"
            style="-fx-border-color:red; -fx-width:3; -fx-border-style:dashed"
          >
    <bottom>
       <HBox  spacing="10" alignment="bottom_right"  >
    <padding>
        <Insets bottom="10" right="10" />
    </padding>
        <Button text="Button2"   />
        <Button text="Button3"   />
        <Button text="Button4" />
        <Button text="Button5"    />
        </HBox>
    </bottom>
    <top>

        <Label text="this label is on the center"
               BorderPane.alignment="TOP_CENTER"
               style="-fx-border-color:blue; -fx-border-width:3; -fx-border.style:dashed"/>

    </top>
<left>
    <Label text="this label is on the Left"
           BorderPane.alignment="TOP_CENTER"
           style="-fx-border-color:blue; -fx-border-width:3; -fx-border.style:dashed"/>
        </left>
    <right>

        <Label text="this label is on the right"
               BorderPane.alignment="TOP_CENTER"
               style="-fx-border-color:blue; -fx-border-width:3; -fx-border.style:dashed"/>
    </right>
</BorderPane>
