(ns reagent-mui.icons.panorama-vertical-select-rounded
  "Imports @mui/icons-material/PanoramaVerticalSelectRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-vertical-select-rounded (create-svg-icon (e "path" #js {"d" "M18.5 12c0-3.89.84-6.95 1.43-8.69.22-.64-.26-1.31-.95-1.31H5c-.68 0-1.16.66-.95 1.31C4.74 5.36 5.5 8.1 5.5 12c0 3.87-.76 6.66-1.45 8.69-.21.65.27 1.31.95 1.31h14c.68 0 1.17-.66.95-1.31-.68-2.03-1.45-4.83-1.45-8.69z"})
                                                       "PanoramaVerticalSelectRounded"))
