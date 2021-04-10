(ns reagent-material-ui.icons.border-color-two-tone
  "Imports @material-ui/icons/BorderColorTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def border-color-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14 6.08l-8 8V15h.92l8-8z", "fillOpacity" ".36"}) (e "path" #js {"d" "M14 3.25l-10 10V17h3.75l10-10L14 3.25zM6.92 15H6v-.92l8-8 .92.92-8 8zM20.71 4.04c.39-.39.39-1.02 0-1.41L18.37.29a.9959.9959 0 0 0-1.41 0L15 2.25 18.75 6l1.96-1.96z"}) (e "path" #js {"d" "M0 20h24v4H0v-4z", "fillOpacity" ".36"}))
                                            "BorderColorTwoTone"))
