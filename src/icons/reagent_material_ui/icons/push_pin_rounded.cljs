(ns reagent-material-ui.icons.push-pin-rounded
  "Imports @material-ui/icons/PushPinRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def push-pin-rounded (create-svg-icon (e "path" #js {"d" "M19 12.87c0-.47-.34-.85-.8-.98C16.93 11.54 16 10.38 16 9V4h1c.55 0 1-.45 1-1s-.45-1-1-1H7c-.55 0-1 .45-1 1s.45 1 1 1h1v5c0 1.38-.93 2.54-2.2 2.89-.46.13-.8.51-.8.98V13c0 .55.45 1 1 1h4.98l.02 7c0 .55.45 1 1 1s1-.45 1-1l-.02-7H18c.55 0 1-.45 1-1v-.13z", "fillRule" "evenodd"})
                                       "PushPinRounded"))
