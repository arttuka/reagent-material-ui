(ns reagent-mui.icons.timer-3-select-outlined
  "Imports @mui/icons-material/Timer3SelectOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def timer-3-select-outlined (create-svg-icon (e "path" #js {"d" "M21 11v2h-4v1h2.5c.83 0 1.5.68 1.5 1.5v2c0 .83-.67 1.5-1.5 1.5H15v-2h4v-1h-2.5c-.82 0-1.5-.68-1.5-1.5v-2c0-.82.68-1.5 1.5-1.5H21zM4 5v3h6v2.5H4v3h6V16H4v3h6c1.66 0 3-1.34 3-3v-1.9c0-1.16-.94-2.1-2.1-2.1 1.16 0 2.1-.94 2.1-2.1V8c0-1.66-1.34-3-3-3H4z"})
                                              "Timer3SelectOutlined"))
