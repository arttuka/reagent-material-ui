(ns reagent-mui.icons.minor-crash-sharp
  "Imports @mui/icons-material/MinorCrashSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def minor-crash-sharp (create-svg-icon (e "path" #js {"d" "M18.57 8H5.43L3 15v9h3v-2h12v2h3v-9l-2.43-7zM6.85 10h10.29l1.04 3H5.81l1.04-3zM6 17.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5S8.33 19 7.5 19 6 18.33 6 17.5zm9 0c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5zM9.41 5 8 6.41l-3-3L6.41 2l3 3zM16 6.41 14.59 5l3-3L19 3.41l-3 3zM13 5h-2V0h2v5z"})
                                        "MinorCrashSharp"))
