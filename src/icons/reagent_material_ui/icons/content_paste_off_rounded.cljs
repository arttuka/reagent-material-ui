(ns reagent-material-ui.icons.content-paste-off-rounded
  "Imports @material-ui/icons/ContentPasteOffRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def content-paste-off-rounded (create-svg-icon (e "path" #js {"d" "M20.49 20.49 3.51 3.51a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.9.91V19c0 1.1.9 2 2 2h13.17l.9.9c.39.39 1.02.39 1.41 0 .4-.39.4-1.02.01-1.41zM5 19V7.83L16.17 19H5zM17 8V5h2v11.17l2 2V5c0-1.1-.9-2-2-2h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5.83l5 5H17zm-5-5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z"})
                                                "ContentPasteOffRounded"))
