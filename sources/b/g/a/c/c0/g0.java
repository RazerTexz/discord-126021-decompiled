package b.g.a.c.c0;

import b.g.a.c.c0.g0;
import java.io.Serializable;

/* JADX INFO: compiled from: VisibilityChecker.java */
/* JADX INFO: loaded from: classes3.dex */
public interface g0<T extends g0<T>> {

    /* JADX INFO: compiled from: VisibilityChecker.java */
    public class a implements g0<a>, Serializable {
        public static final a j;
        private static final long serialVersionUID = 1;
        public final b.g.a.a.e.a _creatorMinLevel;
        public final b.g.a.a.e.a _fieldMinLevel;
        public final b.g.a.a.e.a _getterMinLevel;
        public final b.g.a.a.e.a _isGetterMinLevel;
        public final b.g.a.a.e.a _setterMinLevel;

        static {
            b.g.a.a.e.a aVar = b.g.a.a.e.a.PUBLIC_ONLY;
            b.g.a.a.e.a aVar2 = b.g.a.a.e.a.ANY;
            j = new a(aVar, aVar, aVar2, aVar2, aVar);
        }

        public a(b.g.a.a.e.a aVar, b.g.a.a.e.a aVar2, b.g.a.a.e.a aVar3, b.g.a.a.e.a aVar4, b.g.a.a.e.a aVar5) {
            this._getterMinLevel = aVar;
            this._isGetterMinLevel = aVar2;
            this._setterMinLevel = aVar3;
            this._creatorMinLevel = aVar4;
            this._fieldMinLevel = aVar5;
        }

        public final b.g.a.a.e.a a(b.g.a.a.e.a aVar, b.g.a.a.e.a aVar2) {
            return aVar2 == b.g.a.a.e.a.DEFAULT ? aVar : aVar2;
        }

        public a b(b.g.a.a.e.a aVar, b.g.a.a.e.a aVar2, b.g.a.a.e.a aVar3, b.g.a.a.e.a aVar4, b.g.a.a.e.a aVar5) {
            return (aVar == this._getterMinLevel && aVar2 == this._isGetterMinLevel && aVar3 == this._setterMinLevel && aVar4 == this._creatorMinLevel && aVar5 == this._fieldMinLevel) ? this : new a(aVar, aVar2, aVar3, aVar4, aVar5);
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }
    }
}
