(ns reagent-mui.icons.synagogue-rounded
  "Imports @mui/icons-material/SynagogueRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def synagogue-rounded (create-svg-icon (e "path" #js {"d" "M6 8.94V21h4v-4.89c0-1 .68-1.92 1.66-2.08 1.26-.21 2.34.76 2.34 1.97v5h4V8.94c0-.59-.26-1.16-.72-1.54l-4-3.33c-.74-.62-1.82-.62-2.56 0l-4 3.33c-.46.38-.72.94-.72 1.54zM13.5 10c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5.67-1.5 1.5-1.5 1.5.67 1.5 1.5zM3 5c-1.1 0-2 .9-2 2v1h4V7c0-1.1-.9-2-2-2zm0 16h2V9H1v10c0 1.1.9 2 2 2zM21 5c-1.1 0-2 .9-2 2v1h4V7c0-1.1-.9-2-2-2zm-2 16h2c1.1 0 2-.9 2-2V9h-4v12z"})
                                        "SynagogueRounded"))
