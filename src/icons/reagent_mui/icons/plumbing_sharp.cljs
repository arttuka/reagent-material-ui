(ns reagent-mui.icons.plumbing-sharp
  "Imports @mui/icons-material/PlumbingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def plumbing-sharp (create-svg-icon [(e "path" #js {"d" "m16.16 5.64 3.54 3.54c1.17-1.17 1.17-3.07 0-4.24L16.16 1.4l-4.24 4.24 2.12 2.12 2.12-2.12zM4.842 12.7081l3.5355-3.5355 2.1213 2.1213-3.5355 3.5355z"}) (e "path" #js {"d" "m15.45 7.76-1.41 1.41-4.25-4.24-2.12 2.12 4.24 4.24-8.49 8.49 2.83 2.83L16.86 12l.71.71 1.41-1.41-3.53-3.54z"})]
                                     "PlumbingSharp"))
