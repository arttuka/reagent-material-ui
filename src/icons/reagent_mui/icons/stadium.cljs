(ns reagent-mui.icons.stadium
  "Imports @mui/icons-material/Stadium as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stadium (create-svg-icon (e "path" #js {"d" "M7 5 3 7V3l4 2zm11-2v4l4-2-4-2zm-7-1v4l4-2-4-2zm-6 8.04c1.38.49 3.77.96 7 .96s5.62-.47 7-.96C19 9.86 16.22 9 12 9s-7 .86-7 1.04zM15 17H9v4.88c-4.06-.39-7-1.54-7-2.88v-9c0-1.66 4.48-3 10-3s10 1.34 10 3v9c0 1.34-2.94 2.48-7 2.87V17z"})
                              "Stadium"))
