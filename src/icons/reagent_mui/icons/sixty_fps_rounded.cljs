(ns reagent-mui.icons.sixty-fps-rounded
  "Imports @mui/icons-material/SixtyFpsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sixty-fps-rounded (create-svg-icon (e "path" #js {"d" "M19 8v8h-4V8h4m0-3h-4c-1.66 0-3 1.34-3 3v8c0 1.66 1.34 3 3 3h4c1.66 0 3-1.34 3-3V8c0-1.66-1.34-3-3-3zm-9 1.5C10 5.67 9.33 5 8.5 5H5C3.34 5 2 6.34 2 8v8c0 1.66 1.34 3 3 3h3c1.66 0 3-1.34 3-3v-3c0-1.66-1.34-3-3-3H5V8h3.5c.83 0 1.5-.67 1.5-1.5zM8 13v3H5v-3h3z"})
                                        "SixtyFpsRounded"))
