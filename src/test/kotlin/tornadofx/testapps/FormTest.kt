package tornadofx.testapps

import javafx.geometry.Orientation
import tornadofx.*

class FormApp : App(FormView::class)

class FormView : View("My Form") {
    override val root = vbox {
        label("Hello")

        form {
            fieldset("FieldSet") {
                labelPosition = Orientation.VERTICAL

                field("Field 1") {
                    textarea() {
                        prefRowCount = 2
                    }
                }

                field("Field 2") {
                    textarea() {
                        prefRowCount = 10
                    }
                }
            }
        }
    }
}