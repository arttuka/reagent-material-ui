(ns reagent-material-ui.icons.weekend-sharp
  "Imports @material-ui/icons/WeekendSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def weekend-sharp (create-svg-icon (e "path" #js {"d" "M6 9.03V14h12V9.03h2V5H4v4.03zM19 15H5v-4.97H1V19h22v-8.97h-4z"})
                                    "WeekendSharp"))
