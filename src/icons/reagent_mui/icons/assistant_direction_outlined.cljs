(ns reagent-mui.icons.assistant-direction-outlined
  "Imports @mui/icons-material/AssistantDirectionOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assistant-direction-outlined (create-svg-icon [(e "path" #js {"d" "M12 1C5.9 1 1 5.9 1 12s4.9 11 11 11 11-4.9 11-11S18.1 1 12 1zm0 20c-4.99 0-9-4.01-9-9s4.01-9 9-9 9 4.01 9 9-4.01 9-9 9z"}) (e "path" #js {"d" "M19.73 11.42 12.54 4.2c-.36-.27-.8-.27-1.15 0L4.2 11.42c-.27.36-.27.8 0 1.16l7.19 7.22c.36.27.8.27 1.15 0l7.19-7.22c.36-.36.36-.89 0-1.16zM13.5 14.5l-1.41-1.41L13.17 12H10v3H8v-4c0-.6.4-1 1-1h4.17l-1.09-1.09L13.5 7.5 17 11l-3.5 3.5z"})]
                                                   "AssistantDirectionOutlined"))
