(ns reagent-material-ui.icons.view-column-two-tone
  "Imports @material-ui/icons/ViewColumnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-column-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 7h3v9H6zm5 0h3v9h-3zm5 0h3v9h-3z", "opacity" ".3"}) (e "path" #js {"d" "M4 5v13h17V5H4zm5 11H6V7h3v9zm5 0h-3V7h3v9zm5 0h-3V7h3v9z"}))
                                           "ViewColumnTwoTone"))
