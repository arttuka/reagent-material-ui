(ns reagent-mui.icons.access-time-filled-rounded
  "Imports @mui/icons-material/AccessTimeFilledRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def access-time-filled-rounded (create-svg-icon (e "path" #js {"d" "M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM16 16c-.39.39-1.02.39-1.41 0l-3.29-3.29c-.19-.19-.3-.44-.3-.71V8c0-.55.45-1 1-1s1 .45 1 1v3.59l3 3c.39.39.39 1.02 0 1.41z"})
                                                 "AccessTimeFilledRounded"))
