(ns reagent-material-ui.icons.event-busy-rounded
  "Imports @material-ui/icons/EventBusyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def event-busy-rounded (create-svg-icon (e "path" #js {"d" "M19 4h-1V3c0-.55-.45-1-1-1s-1 .45-1 1v1H8V3c0-.55-.45-1-1-1s-1 .45-1 1v1H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 16H5V10h14v10zM9 18c.39.39 1.02.39 1.41 0L12 16.41 13.59 18c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L13.41 15 15 13.41c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L12 13.59 10.41 12A.9959.9959 0 0 0 9 12c-.39.39-.39 1.02 0 1.41L10.59 15 9 16.59c-.39.39-.39 1.02 0 1.41z"})
                                         "EventBusyRounded"))
