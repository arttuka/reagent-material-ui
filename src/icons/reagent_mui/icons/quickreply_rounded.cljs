(ns reagent-mui.icons.quickreply-rounded
  "Imports @mui/icons-material/QuickreplyRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def quickreply-rounded (create-svg-icon [(e "path" #js {"d" "M22 4c0-1.1-.9-2-2-2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h9v-7c0-.55.45-1 1-1h6V4z"}) (e "path" #js {"d" "M21.69 16H20.3l1.4-3.3c.14-.33-.1-.7-.46-.7H17.5c-.28 0-.5.22-.5.5v5c0 .28.22.5.5.5H19v3.94c0 .26.36.35.47.11l2.66-5.33c.17-.33-.07-.72-.44-.72z"})]
                                         "QuickreplyRounded"))
