class Thing1 {
  _size = 0;
}
/*
class Thing2 {
  get size(): number {
    return this._size;
  }
}

class Thing3 {
  set size(value: string | number | boolean) {
    let num = Number(value);
 
    // Don't allow NaN, Infinity, etc
 
    if (!Number.isFinite(num)) {
      this._size = 0;
      return;
    }
 
    this._size = num;
  }
}

class Thing4 {
  static staticMethod() {}
}

class Thing5 {
  instanceMethod(v: boolean): string {return ""}
}
*/