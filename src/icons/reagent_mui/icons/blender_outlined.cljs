(ns reagent-mui.icons.blender-outlined
  "Imports @mui/icons-material/BlenderOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def blender-outlined (create-svg-icon [(e "path" #js {"d" "M16.13 15.13 18 3h-4V2h-4v1H5c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2h2.23l.64 4.13C6.74 16.05 6 17.43 6 19v1c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2v-1c0-1.57-.74-2.95-1.87-3.87zM5 9V5h1.31l.62 4H5zm10.67-4-1.38 9H9.72L8.33 5h7.34zM16 20H8v-1c0-1.65 1.35-3 3-3h2c1.65 0 3 1.35 3 3v1z"}) (e "circle" #js {"cx" "12", "cy" "18", "r" "1"})]
                                       "BlenderOutlined"))
