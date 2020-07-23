(ns reagent-material-ui.icons.compass-calibration-rounded
  "Imports @material-ui/icons/CompassCalibrationRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def compass-calibration-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "4", "cx" "12"}) (e "path" #js {"d" "M12 3C8.49 3 5.28 4.29 2.8 6.41c-.44.38-.48 1.06-.06 1.48l3.6 3.6c.36.36.92.39 1.32.08 1.2-.94 2.71-1.5 4.34-1.5 1.64 0 3.14.56 4.34 1.49.4.31.96.28 1.31-.08l3.6-3.6c.42-.42.38-1.1-.07-1.48C18.72 4.28 15.51 3 12 3z"}))
                                                  "CompassCalibrationRounded"))
