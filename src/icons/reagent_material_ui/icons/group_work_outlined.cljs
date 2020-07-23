(ns reagent-material-ui.icons.group-work-outlined
  "Imports @material-ui/icons/GroupWorkOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def group-work-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z"}) (e "circle" #js {"cy" "14", "r" "2", "cx" "8"}) (e "circle" #js {"cy" "8", "r" "2", "cx" "12"}) (e "circle" #js {"cy" "14", "r" "2", "cx" "16"}))
                                          "GroupWorkOutlined"))
