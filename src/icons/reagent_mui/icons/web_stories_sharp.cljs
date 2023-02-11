(ns reagent-mui.icons.web-stories-sharp
  "Imports @mui/icons-material/WebStoriesSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def web-stories-sharp (create-svg-icon (e "path" #js {"d" "M17 4h2v16h-2V4zM2 2v20h13V2H2zm19 16h1.5V6H21v12z"})
                                        "WebStoriesSharp"))
