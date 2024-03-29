(ns reagent-mui.icons.mail-two-tone
  "Imports @mui/icons-material/MailTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mail-two-tone (create-svg-icon [(e "path" #js {"d" "M20 6H4l8 4.99zM4 8v10h16V8l-8 5z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 2-8 4.99L4 6h16zm0 12H4V8l8 5 8-5v10z"})]
                                    "MailTwoTone"))
