(ns reagent-material-ui.icons.no-photography-rounded
  "Imports @material-ui/icons/NoPhotographyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-photography-rounded (create-svg-icon (e "path" #js {"d" "M10.94 8.12L7.48 4.66l.92-1.01c.38-.41.92-.65 1.48-.65h4.24c.56 0 1.1.24 1.47.65L16.83 5H20c1.1 0 2 .9 2 2v12c0 .05-.01.1-.02.16l-5.1-5.1c.08-.35.12-.7.12-1.06 0-2.76-2.24-5-5-5-.36 0-.71.04-1.06.12zm8.84 14.49L18.17 21H4c-1.1 0-2-.9-2-2V7c0-.59.27-1.12.68-1.49L1.39 4.22a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l18.38 18.38c.39.39.39 1.02 0 1.41-.38.4-1.01.4-1.4.01zm-5.29-5.29l-1.5-1.5c-.32.1-.64.18-.99.18-1.66 0-3-1.34-3-3 0-.35.08-.67.19-.98l-1.5-1.5C7.25 11.24 7 12.09 7 13c0 2.76 2.24 5 5 5 .91 0 1.76-.25 2.49-.68z"})
                                             "NoPhotographyRounded"))
