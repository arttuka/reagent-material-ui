(ns reagent-material-ui.icons.warning-amber-rounded
  "Imports @material-ui/icons/WarningAmberRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def warning-amber-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.53 5l7.53 13.01H4L11.53 5M2.27 17.01c-.77 1.33.19 3 1.73 3h15.06c1.54 0 2.5-1.67 1.73-3L13.26 4c-.77-1.33-2.69-1.33-3.46 0L2.27 17.01z"}) (e "path" #js {"d" "M10.53 10.01V13c0 .55.45 1 1 1s1-.45 1-1v-2.99c0-.55-.45-1-1-1s-1 .45-1 1z"}) (e "circle" #js {"cy" "16.01", "r" "1", "cx" "11.53"}))
                                            "WarningAmberRounded"))
