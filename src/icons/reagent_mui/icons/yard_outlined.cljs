(ns reagent-mui.icons.yard-outlined
  "Imports @mui/icons-material/YardOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def yard-outlined (create-svg-icon (e "path" #js {"d" "M18 13c-3.31 0-6 2.69-6 6 3.31 0 6-2.69 6-6zM6 13c0 3.31 2.69 6 6 6 0-3.31-2.69-6-6-6zm2-1.97c0 .86.7 1.56 1.56 1.56.33 0 .63-.1.89-.28l-.01.12c0 .86.7 1.56 1.56 1.56s1.56-.7 1.56-1.56l-.01-.12c.25.17.56.28.89.28.86 0 1.56-.7 1.56-1.56 0-.62-.37-1.16-.89-1.41.52-.24.89-.78.89-1.4 0-.86-.7-1.56-1.56-1.56-.33 0-.63.1-.89.28l.01-.12c0-.86-.7-1.56-1.56-1.56s-1.56.7-1.56 1.56l.01.12c-.25-.18-.56-.28-.89-.28-.86 0-1.56.7-1.56 1.56 0 .62.37 1.16.89 1.41-.52.24-.89.78-.89 1.4zm4-2.97c.86 0 1.56.7 1.56 1.56s-.7 1.56-1.56 1.56-1.56-.7-1.56-1.56.7-1.56 1.56-1.56zM20 4v16H4V4h16m0-2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2z"})
                                    "YardOutlined"))
