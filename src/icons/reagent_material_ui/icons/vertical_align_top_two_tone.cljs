(ns reagent-material-ui.icons.vertical-align-top-two-tone
  "Imports @material-ui/icons/VerticalAlignTopTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-align-top-two-tone (create-svg-icon (e "path" #js {"d" "M4 3h16v2H4zm4 8h3v10h2V11h3l-4-4z"})
                                                  "VerticalAlignTopTwoTone"))
