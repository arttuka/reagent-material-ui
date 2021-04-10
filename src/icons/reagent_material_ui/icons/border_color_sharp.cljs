(ns reagent-material-ui.icons.border-color-sharp
  "Imports @material-ui/icons/BorderColorSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def border-color-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17.75 8L14 4.25l-10 10V18h3.75l10-10zm3.66-3.66L17.66.59 15 3.25 18.75 7l2.66-2.66z"}) (e "path" #js {"d" "M0 20h24v4H0v-4z", "fillOpacity" ".36"}))
                                         "BorderColorSharp"))
