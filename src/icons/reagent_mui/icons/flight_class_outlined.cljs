(ns reagent-mui.icons.flight-class-outlined
  "Imports @mui/icons-material/FlightClassOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flight-class-outlined (create-svg-icon (e "path" #js {"d" "M16 4h-2c-1.1 0-2 .9-2 2v5c0 1.1.9 2 2 2h2c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 7h-2V6h2v5zm-6.5 5H18v2H9.49c-.88 0-1.66-.58-1.92-1.43L5 8V4h2v4l2.5 8zM8 19h10v2H8v-2z"})
                                            "FlightClassOutlined"))
