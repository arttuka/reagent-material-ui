(ns reagent-mui.icons.attach-email-rounded
  "Imports @mui/icons-material/AttachEmailRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def attach-email-rounded (create-svg-icon [(e "path" #js {"d" "M21 10V4c0-1.1-.9-2-2-2H3c-1.1 0-1.99.9-1.99 2L1 16c0 1.1.9 2 2 2h11v-5c0-1.66 1.34-3 3-3h4zm-9.47.67c-.32.2-.74.2-1.06 0L3.4 6.25c-.25-.16-.4-.43-.4-.72 0-.67.73-1.07 1.3-.72L11 9l6.7-4.19c.57-.35 1.3.05 1.3.72 0 .29-.15.56-.4.72l-7.07 4.42z"}) (e "path" #js {"d" "M22 14c-.55 0-1 .45-1 1v3c0 1.1-.9 2-2 2s-2-.9-2-2v-4.5c0-.28.22-.5.5-.5s.5.22.5.5V17c0 .55.45 1 1 1s1-.45 1-1v-3.5c0-1.38-1.12-2.5-2.5-2.5S15 12.12 15 13.5V18c0 2.21 1.79 4 4 4s4-1.79 4-4v-3c0-.55-.45-1-1-1z"})]
                                           "AttachEmailRounded"))
