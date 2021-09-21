(ns reagent-mui.icons.inbox-rounded
  "Imports @mui/icons-material/InboxRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def inbox-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 2v9h-3.56c-.36 0-.68.19-.86.5-.52.9-1.47 1.5-2.58 1.5s-2.06-.6-2.58-1.5c-.18-.31-.51-.5-.86-.5H5V5h14z"})
                                    "InboxRounded"))
