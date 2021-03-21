(ns reagent-material-ui.icons.text-fields-rounded
  "Imports @material-ui/icons/TextFieldsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def text-fields-rounded (create-svg-icon (e "path" #js {"d" "M13.5 4h-10C2.67 4 2 4.67 2 5.5S2.67 7 3.5 7H7v11.5c0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5V7h3.5c.83 0 1.5-.67 1.5-1.5S14.33 4 13.5 4zm8.5 6.5c0-.83-.67-1.5-1.5-1.5h-6c-.83 0-1.5.67-1.5 1.5s.67 1.5 1.5 1.5H16v6.5c0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5V12h1.5c.83 0 1.5-.67 1.5-1.5z"})
                                          "TextFieldsRounded"))
