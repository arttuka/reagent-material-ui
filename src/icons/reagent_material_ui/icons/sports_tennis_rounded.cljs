(ns reagent-material-ui.icons.sports-tennis-rounded
  "Imports @material-ui/icons/SportsTennisRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-tennis-rounded (create-svg-icon (e "path" #js {"d" "M19.52 2.49C17.18.15 12.9.62 9.97 3.55c-1.6 1.6-2.52 3.87-2.54 5.46-.02 1.58.26 3.89-1.35 5.5l-3.37 3.37c-.39.39-.39 1.03 0 1.42.39.39 1.03.39 1.42 0l3.37-3.37c1.61-1.61 3.92-1.33 5.5-1.35s3.86-.94 5.46-2.54c2.92-2.93 3.4-7.21 1.06-9.55zm-9.2 9.18c-1.53-1.53-1.05-4.61 1.06-6.72 2.11-2.11 5.18-2.59 6.72-1.06 1.53 1.53 1.05 4.61-1.06 6.72-2.11 2.11-5.18 2.59-6.72 1.06zm10.51 4.5C20.05 15.39 19.02 15 18 15s-2.05.39-2.83 1.17c-1.56 1.56-1.56 4.09 0 5.66.78.78 1.81 1.17 2.83 1.17s2.05-.39 2.83-1.17c1.56-1.56 1.56-4.09 0-5.66z"})
                                            "SportsTennisRounded"))
