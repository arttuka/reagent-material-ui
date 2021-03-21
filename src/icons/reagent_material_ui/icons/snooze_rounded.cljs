(ns reagent-material-ui.icons.snooze-rounded
  "Imports @material-ui/icons/SnoozeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def snooze-rounded (create-svg-icon (e "path" #js {"d" "M12 4c-4.97 0-9 4.03-9 9s4.03 9 9 9 9-4.03 9-9-4.03-9-9-9zm1.75 10.5c.41 0 .75.34.75.75s-.34.75-.75.75h-3.32c-.52 0-.93-.42-.93-.93 0-.23.08-.45.23-.62l2.6-2.95h-2.09c-.41 0-.75-.34-.75-.75s.35-.75.76-.75h3.29c.53 0 .96.43.96.96 0 .23-.09.46-.24.63l-2.57 2.91h2.06zM6.29 4.46c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L2.05 5.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l2.83-2.83zm15.66 1.42l-2.83-2.83a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.83 2.83c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41z"})
                                     "SnoozeRounded"))
