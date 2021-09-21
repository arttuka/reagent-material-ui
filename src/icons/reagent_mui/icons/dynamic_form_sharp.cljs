(ns reagent-mui.icons.dynamic-form-sharp
  "Imports @mui/icons-material/DynamicFormSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dynamic-form-sharp (create-svg-icon (e "path" #js {"d" "M17 20v-9h-2V4h7l-2 5h2l-5 11zm-2-7v7H2v-7h13zm-8.75 2.75h-1.5v1.5h1.5v-1.5zM13 4v7H2V4h11zM6.25 6.75h-1.5v1.5h1.5v-1.5z"})
                                         "DynamicFormSharp"))
