(ns reagent-mui.icons.move-to-inbox-rounded
  "Imports @mui/icons-material/MoveToInboxRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def move-to-inbox-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 11h-3.56c-.36 0-.68.19-.86.5-.52.9-1.47 1.5-2.58 1.5s-2.06-.6-2.58-1.5c-.18-.31-.51-.5-.86-.5H5V5h14v9zm-4.21-4H13V7c0-.55-.45-1-1-1s-1 .45-1 1v3H9.21c-.45 0-.67.54-.35.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.31-.31.09-.85-.36-.85z"})
                                            "MoveToInboxRounded"))
