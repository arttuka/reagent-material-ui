(ns reagent-material-ui.icons.follow-the-signs-two-tone
  "Imports @material-ui/icons/FollowTheSignsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def follow-the-signs-two-tone (create-svg-icon [(e "path" #js {"d" "M17.64 7.75V6h-3.51V4.5h3.51V2.75l2.49 2.5-2.49 2.5z", "opacity" ".3"}) (e "path" #js {"d" "M9.12 5.25c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm-3.74 3.4-2.75 14.1h2.1l1.75-8 2.15 2v6h2V15.2l-2.05-2.05.6-3c1.3 1.6 3.25 2.6 5.45 2.6v-2c-1.85 0-3.45-1-4.35-2.45l-.96-1.6c-.35-.6-1-.95-1.7-.95-.25 0-.5.05-.75.15L1.62 8.05v4.7h2V9.4l1.76-.75m7.24-6.9v7h3.75v14h1.5v-14h3.75v-7h-9zm5.02 6V6h-3.51V4.5h3.51V2.75l2.49 2.5-2.49 2.5z"})]
                                                "FollowTheSignsTwoTone"))
