(ns reagent-mui.icons.picture-in-picture-outlined
  "Imports @mui/icons-material/PictureInPictureOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def picture-in-picture-outlined (create-svg-icon (e "path" #js {"d" "M19 7h-8v6h8V7zm-2 4h-4V9h4v2zm4-8H3c-1.1 0-2 .9-2 2v14c0 1.1.9 1.98 2 1.98h18c1.1 0 2-.88 2-1.98V5c0-1.1-.9-2-2-2zm0 16.01H3V4.98h18v14.03z"})
                                                  "PictureInPictureOutlined"))
