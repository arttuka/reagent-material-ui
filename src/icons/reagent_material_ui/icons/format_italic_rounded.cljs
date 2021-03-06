(ns reagent-material-ui.icons.format-italic-rounded
  "Imports @material-ui/icons/FormatItalicRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-italic-rounded (create-svg-icon (e "path" #js {"d" "M9 5.5c0 .83.67 1.5 1.5 1.5h2l-4 10h-2c-.83 0-1.5.67-1.5 1.5S5.67 20 6.5 20h7c.83 0 1.5-.67 1.5-1.5s-.67-1.5-1.5-1.5h-2l4-10h2c.83 0 1.5-.67 1.5-1.5S18.33 4 17.5 4h-7C9.67 4 9 4.67 9 5.5z"})
                                            "FormatItalicRounded"))
