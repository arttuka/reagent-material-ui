(ns reagent-material-ui.icons.face-retouching-off-two-tone
  "Imports @material-ui/icons/FaceRetouchingOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def face-retouching-off-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4c-.46 0-.91.05-1.34.12C12.06 6.44 14.6 8 17.5 8c.46 0 .91-.05 1.34-.12C17.44 5.56 14.9 4 12 4zM4.42 9.47c.67-.38 1.28-.86 1.81-1.41l-.72-.72c-.46.65-.83 1.36-1.09 2.13z", "opacity" ".3"}) (e "path" #js {"d" "M9 14.25c.69 0 1.25-.56 1.25-1.25S9.69 11.75 9 11.75s-1.25.56-1.25 1.25.56 1.25 1.25 1.25zM17.5 10c.75 0 1.47-.09 2.17-.24.21.71.33 1.46.33 2.24 0 1.22-.28 2.37-.77 3.4l1.49 1.49C21.53 15.44 22 13.78 22 12c0-5.52-4.48-10-10-10-1.78 0-3.44.47-4.89 1.28l5.33 5.33c1.49.88 3.21 1.39 5.06 1.39zm-6.84-5.88c.43-.07.88-.12 1.34-.12 2.9 0 5.44 1.56 6.84 3.88-.43.07-.88.12-1.34.12-2.9 0-5.44-1.56-6.84-3.88zm-8.77-.4l2.19 2.19C2.78 7.6 2 9.71 2 12c0 5.52 4.48 10 10 10 2.29 0 4.4-.78 6.09-2.08l2.19 2.19 1.41-1.41L3.31 2.31 1.89 3.72zm14.77 14.77C15.35 19.44 13.74 20 12 20c-4.41 0-8-3.59-8-8 0-.05.01-.1 0-.14 1.39-.52 2.63-1.35 3.64-2.39l9.02 9.02zM5.51 7.34l.72.72c-.53.55-1.14 1.03-1.81 1.41.26-.77.63-1.48 1.09-2.13z"}))
                                                   "FaceRetouchingOffTwoTone"))