(ns reagent-mui.icons.sixty-fps-sharp
  "Imports @mui/icons-material/SixtyFpsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sixty-fps-sharp (create-svg-icon (e "path" #js {"d" "M19 8v8h-4V8h4m3-3H12v14h10V5zM10 8V5H2v14h9v-9H5V8h5zm-2 5v3H5v-3h3z"})
                                      "SixtyFpsSharp"))
