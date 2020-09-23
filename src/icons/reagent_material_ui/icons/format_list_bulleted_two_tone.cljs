(ns reagent-material-ui.icons.format-list-bulleted-two-tone
  "Imports @material-ui/icons/FormatListBulletedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-list-bulleted-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 5h14v2H7z"}) (e "circle" #js {"cy" "6", "r" "1.5", "cx" "4"}) (e "path" #js {"d" "M7 11h14v2H7zm0 6h14v2H7zm-3 2.5c.82 0 1.5-.68 1.5-1.5s-.67-1.5-1.5-1.5-1.5.68-1.5 1.5.68 1.5 1.5 1.5z"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "4"}))
                                                    "FormatListBulletedTwoTone"))
