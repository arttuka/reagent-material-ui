(ns reagent-material-ui.icons.wb-cloudy-rounded
  "Imports @material-ui/icons/WbCloudyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wb-cloudy-rounded (create-svg-icon (e "path" #js {"d" "M19 11c0-3.87-3.13-7-7-7-3.22 0-5.93 2.18-6.74 5.15C2.82 9.71 1 11.89 1 14.5 1 17.54 3.46 20 6.5 20h12c2.49-.01 4.5-2.03 4.5-4.52 0-2.33-1.75-4.22-4-4.48z"})
                                        "WbCloudyRounded"))
