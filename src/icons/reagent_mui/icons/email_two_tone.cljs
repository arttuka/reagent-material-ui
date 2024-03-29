(ns reagent-mui.icons.email-two-tone
  "Imports @mui/icons-material/EmailTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def email-two-tone (create-svg-icon [(e "path" #js {"d" "m20 8-8 5-8-5v10h16zm0-2H4l8 4.99z", "opacity" ".3"}) (e "path" #js {"d" "M4 20h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2zM20 6l-8 4.99L4 6h16zM4 8l8 5 8-5v10H4V8z"})]
                                     "EmailTwoTone"))
