(ns reagent-mui.icons.vrpano-sharp
  "Imports @mui/icons-material/VrpanoSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vrpano-sharp (create-svg-icon (e "path" #js {"d" "M12 5.5c-5.25 0-9.01-1.54-10-1.92V20.4c2.16-.76 5.21-1.9 10-1.9 4.78 0 7.91 1.17 10 1.9V3.6c-2.09.73-5.23 1.9-10 1.9zm0 9.5c-2.34 0-4.52.15-6.52.41l3.69-4.42 2 2.4L14 10l4.51 5.4c-1.99-.25-4.21-.4-6.51-.4z"})
                                   "VrpanoSharp"))
