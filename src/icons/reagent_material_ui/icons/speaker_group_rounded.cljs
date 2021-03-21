(ns reagent-material-ui.icons.speaker-group-rounded
  "Imports @material-ui/icons/SpeakerGroupRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def speaker-group-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5c-.55 0-1 .45-1 1v15c0 1.1.9 2 2 2h9c.55 0 1-.45 1-1s-.45-1-1-1H6V6c0-.55-.45-1-1-1z"}) (e "circle" #js {"cy" "12.5", "r" "1.5", "cx" "14.5"}) (e "path" #js {"d" "M19 1h-9c-1.1 0-2 .9-2 2v13.99c0 1.1.89 2 2 2l9 .01c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-4.5 3.5c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5S13 6.83 13 6s.67-1.5 1.5-1.5zm0 11.5c-1.93 0-3.5-1.57-3.5-3.5S12.57 9 14.5 9s3.5 1.57 3.5 3.5-1.57 3.5-3.5 3.5z"}))
                                            "SpeakerGroupRounded"))
