(ns reagent-mui.icons.tornado-sharp
  "Imports @mui/icons-material/TornadoSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tornado-sharp (create-svg-icon (e "path" #js {"d" "M20.11 8 23 3H1l2.89 5zM7.95 15 12 22l4.05-7zm11-5H5.05l1.74 3h10.42z"})
                                    "TornadoSharp"))
