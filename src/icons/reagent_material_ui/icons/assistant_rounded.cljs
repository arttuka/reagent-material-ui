(ns reagent-material-ui.icons.assistant-rounded
  "Imports @material-ui/icons/AssistantRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def assistant-rounded (create-svg-icon (e "path" #js {"d" "M19 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h4l2.29 2.29c.39.39 1.02.39 1.41 0L15 20h4c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-5.43 10.57l-1.12 2.44c-.18.39-.73.39-.91 0l-1.12-2.44-2.44-1.12c-.39-.18-.39-.73 0-.91l2.44-1.12 1.12-2.44c.18-.39.73-.39.91 0l1.12 2.44 2.44 1.12c.39.18.39.73 0 .91l-2.44 1.12z"})
                                        "AssistantRounded"))
