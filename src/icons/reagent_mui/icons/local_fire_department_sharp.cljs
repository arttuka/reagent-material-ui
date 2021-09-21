(ns reagent-mui.icons.local-fire-department-sharp
  "Imports @mui/icons-material/LocalFireDepartmentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-fire-department-sharp (create-svg-icon (e "path" #js {"d" "M19.48 12.37C17.82 8.05 11.65 8 13.99.99 9.52 3 5.98 8.17 9.48 15 4.53 12.92 6.7 7.71 6.7 7.71S4 9.37 4 14.39c.38 5.6 5.11 7.32 6.81 7.54 2.43.31 5.06-.14 6.95-1.87 2.08-1.93 2.84-5.01 1.72-7.69zM10.2 17.4c1.44-.35 2.18-1.39 2.38-2.31.33-1.43-.96-2.83-.09-5.09.33 1.87 3.27 3.04 3.27 5.08.08 2.53-2.66 4.7-5.56 2.32z"})
                                                  "LocalFireDepartmentSharp"))
