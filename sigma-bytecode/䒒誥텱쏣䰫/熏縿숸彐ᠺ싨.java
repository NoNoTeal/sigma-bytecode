public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u718f\u7e3f\uc238\u5f50\u183a\uc2e8 {
    public void \u718f\u7e3f\uc238\u5f50\u183a\uc2e8(int p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::<init>, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, p0:int, p1:int, newarray:long[](long.class, div:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u6b0d\ud217\ubded\u9033\u927d\u92ff, mul:int(p1:int, p0:int), ldc:int(64)), ldc:int(64))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\u7e3f\uc238\u5f50\u183a\uc2e8(int p0, int p1, long[] p2) {
        var_6_90 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        invokespecial:Object(Object::<init>, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8)
        invokestatic:void(Validate::inclusiveBetween, ldc:long(1L), ldc:long(32L), i2l:long(p0:int))
        putfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\uc31c\u6435\u446c\u7e3f\uc31c\u67e9, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, p1:int)
        putfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, p0:int)
        putfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, p2:long[])
        putfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8, sub:long(shl:long(ldc:long(1L), p0:int), ldc:long(1L)))
        var_6_90 = div:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u6b0d\ud217\ubded\u9033\u927d\u92ff, mul:int(p1:int, p0:int), ldc:int(64)), ldc:int(64))
        
        if (cmpeq:boolean(arraylength:int(p2:long[]), var_6_90:int)) {
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u56bd\ufe34\u7049\u5245\u5140\u8753), and:int(ldc:int(23574), ldc:int(-23575)))), arraylength:int(p2:long[])), loadelement:String(getstatic:String[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u56bd\ufe34\u7049\u5245\u5140\u8753), xor:int(ldc:int(24), ldc:int(25)))), var_6_90:int))))
    }
    
    public void \u6d69\u156b\u3c25\u600f\u600f\u51fa(int p0, int p1) {
        var_5_83 : int
        var_6_8A : int
        var_7_A5 : int
        var_8_AF : int
        var_9_EC : int
        var_10_F5 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(Validate::inclusiveBetween, ldc:long(0L), i2l:long(sub:int(getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\uc31c\u6435\u446c\u7e3f\uc31c\u67e9, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), and:int(ldc:int(513), ldc:int(2465)))), i2l:long(p0:int))
            invokestatic:void(Validate::inclusiveBetween, ldc:long(0L), getfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), i2l:long(p1:int))
            var_5_83 = mul:int(p0:int, getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8))
            var_6_8A = shr:int(var_5_83:int, ldc:int(6))
            var_7_A5 = shr:int(sub:int(mul:int(add:int(p0:int, xor:int(ldc:int(18948), ldc:int(18949))), getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8)), and:int(ldc:int(12289), ldc:int(2177))), ldc:int(6))
            var_8_AF = xor:int(var_5_83:int, shl:int(var_6_8A:int, ldc:int(6)))
            storeelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_6_8A:int, or:long(and:long(loadelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_6_8A:int), xor:long(shl:long(getfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_8_AF:int), ldc:long(-1L))), shl:long(and:long(i2l:long(p1:int), getfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8)), var_8_AF:int)))
            
            if (cmpne:boolean(var_6_8A:int, var_7_A5:int)) {
                var_9_EC = sub:int(ldc:int(64), var_8_AF:int)
                var_10_F5 = sub:int(getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_9_EC:int)
                storeelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_7_A5:int, or:long(shl:long(ushr:long(loadelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_7_A5:int), var_10_F5:int), var_10_F5:int), shr:long(and:long(i2l:long(p1:int), getfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8)), var_9_EC:int)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u5db4\u9033\ub8be\u183a\ub171\u5f50(int p0) {
        var_4_79 : int
        var_5_80 : int
        var_6_9B : int
        var_7_A5 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        invokestatic:void(Validate::inclusiveBetween, ldc:long(0L), i2l:long(sub:int(getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\uc31c\u6435\u446c\u7e3f\uc31c\u67e9, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), xor:int(ldc:int(-28543), ldc:int(-28544)))), i2l:long(p0:int))
        var_4_79 = mul:int(p0:int, getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8))
        var_5_80 = shr:int(var_4_79:int, ldc:int(6))
        var_6_9B = shr:int(sub:int(mul:int(add:int(p0:int, xor:int(ldc:int(29), ldc:int(28))), getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8)), xor:int(ldc:int(18692), ldc:int(18693))), ldc:int(6))
        var_7_A5 = xor:int(var_4_79:int, shl:int(var_5_80:int, ldc:int(6)))
        
        if (cmpne:boolean(var_5_80:int, var_6_9B:int)) {
            return:int(l2i:int(and:long(or:long(ushr:long(loadelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_5_80:int), var_7_A5:int), shl:long(loadelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_6_9B:int), sub:int(ldc:int(64), var_7_A5:int))), getfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8))))
        }
        
        return:int(l2i:int(and:long(ushr:long(loadelement:long(getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8), var_5_80:int), var_7_A5:int), getfield:long(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u9255\u8c8a\u0b8e\uceb8\ua6bd\u4ab3, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8))))
    }
    
    public long[] \u97e6\u446c\ub8be\u51fa\u4daf\u12cb() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long[](getfield:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\ubf56\uc9f6\ub83f\u7006\u7e3f\uc246, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8))
        }
        
        goto(Label_0006)
    }
    
    public int \u4c2b\u7049\u446c\u4f4a\u5140\u7873() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u4d85\u4c2b\u8389\u836c\ub7dc\u983f, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_204 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1AE_0 : byte[] [generated]
        stack_216_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_141 : byte[]
        var_4_142 : int
        expr_91 : int [generated]
        var_5_191 : int
        var_3_196 : byte[]
        var_4_197 : int
        expr_1AE : byte [generated]
        var_0_20C : int
        expr_216 : byte [generated]
        stack_244_2 : byte [generated]
        expr_BD : int [generated]
        var_3_EA : String
        stack_138_0 : String[] [generated]
        expr_FC : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_204 = and:int(ldc:int(786438718), ldc:int(-51978500))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("B4rBWySBvwktqrwHAG2ub8kmJLQlZLd6ura7sF0TfaAkIWQtYLtruIAuGicot/Fh7W+h8FT6EA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_141 = newarray:byte[](byte.class, expr_6D:int)
                var_4_142 = expr_6D:int
                
                loop {
                    var_0_204 = and:int(var_0_204:int, ldc:int(2110396988))
                    var_4_142 = add:int(var_4_142:int, ldc:int(-1))
                    storeelement:byte(var_3_141:byte[], var_4_142:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_142:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_142:int, xor:int(ldc:int(18444), ldc:int(18445)))), ldc:int(4)), and:int(ldc:int(1039), ldc:int(29295)))))
                    
                    if (cmpne:boolean(var_4_142:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = var_3_141:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(1)), ldc:int(0))) {
                    var_0_204 = and:int(var_0_204:int, ldc:int(1838726023))
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_0_204 = and:int(var_0_204:int, ldc:int(1053875900))
                expr_91 = arraylength:int(stack_91_0:byte[])
                
                if (cmpeq:boolean(expr_91:int, ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_5_191 = expr_91:int
                var_3_196 = newarray:byte[](byte.class, expr_91:int)
                var_4_197 = expr_91:int
                Label_0409:
                
                while (cmpne:boolean(and:int(var_0_204:int, ldc:int(32)), ldc:int(0))) {
                    var_0_204 = and:int(var_0_204:int, ldc:int(771529526))
                    var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                    expr_1AE = loadelement:byte(stack_1AE_0:byte[], var_4_197:int)
                    storeelement:byte(var_3_196:byte[], var_4_197:int, xor:int(add:int(or:int(and:int(shl:int(expr_1AE:byte, xor:int(ldc:int(4610), ldc:int(4614))), ldc:int(-16)), and:int(shr:int(expr_1AE:byte[expected:int], and:int(ldc:int(39), ldc:int(4164))), ldc:int(15))), ldc:int(20)), ldc:int(48)))
                    
                    if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = var_3_196:byte[]
                    goto(Label_0150)
                }
                
                Label_0505:
                
                while (cmpeq:boolean(and:int(var_0_204:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_20C = and:int(var_0_204:int, ldc:int(1825659447))
                    var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                    expr_216 = loadelement:byte(stack_216_0:byte[], var_4_197:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_197:int, ldc:int(2)), neg:int(var_5_191:int)), ldc:int(0))) {
                        var_0_20C = and:int(var_0_20C:int, ldc:int(-1379296457))
                        stack_244_2 = add:byte(expr_216:byte, ldc:byte(2))
                    }
                    else {
                        stack_244_2 = add:byte(expr_216:byte, loadelement:byte(var_3_196:byte[], add:int(var_4_197:int, ldc:int(2))))
                    }
                    
                    var_0_204 = and:int(var_0_20C:int, ldc:int(802274303))
                    storeelement:byte(var_3_196:byte[], var_4_197:int, stack_244_2:byte)
                    
                    if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = var_3_196:byte[]
                    goto(Label_0194)
                }
                
                var_0_204 = and:int(var_0_204:int, ldc:int(-1285585286))
                goto(Label_0409)
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_204 = and:int(var_0_204:int, ldc:int(1068880844))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(32)), ldc:int(0))) {
                        var_0_204 = and:int(var_0_204:int, ldc:int(-1719993663))
                        loopcontinue()
                    }
                    
                    var_0_204 = and:int(var_0_204:int, ldc:int(1844772532))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_5_191 = expr_BD:int
                        var_3_196 = newarray:byte[](byte.class, expr_BD:int)
                        var_4_197 = expr_BD:int
                        goto(Label_0505)
                    }
                }
                
                Label_0194:
                
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_204 = and:int(var_0_204:int, ldc:int(267461506))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_138_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8514), ldc:int(8512)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3082), ldc:int(583)))
            storeelement:String(expr_FC:String[], xor:int(ldc:int(18952), ldc:int(18953)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(23152), ldc:int(-23163)), and:int(ldc:int(2063), ldc:int(399))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(-19700), ldc:int(19603)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(-32504), ldc:int(-32505)), and:int(ldc:int(1078), ldc:int(24630))))
            putstatic:String[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u56bd\ufe34\u7049\u5245\u5140\u8753, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\ufe34\uc84e\u6198\u1833\u4cd9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_608 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_613 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_608 = and:int(ldc:int(1887681443), ldc:int(1670990451))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
            var_3_608 = and:int(var_3_608:int, ldc:int(1496486676))
        }
        else {
            var_3_608 = and:int(var_3_608:int, ldc:int(-304063705))
            var_5_85 = and:int(ldc:int(-22137), ldc:int(18040))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10915), ldc:int(-10916)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_608:int, ldc:int(1257978779))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(185), ldc:int(18689)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(8256), ldc:int(8257)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_608 = and:int(var_3_DA:int, ldc:int(1305520923))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2151), ldc:int(793)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2045655453))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1926513478))
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1587462714))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1274042842))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-977821749))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(777321139))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1045)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(308054380))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-72119713))
                            var_11_EB = and:int(ldc:int(-19932), ldc:int(18651))
                            goto(Label_1445)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2138577009))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(793546003))
                        goto(Label_1045)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(156850737))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1766697397))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1207279587))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(992951957))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-88507585))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2041338390))
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(793856765))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1522438445))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-745664921))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1156343918))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1449532469))
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2022271554))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(313529562))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-662054635))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1622809567))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(5125), ldc:int(5124))
                                goto(Label_1045)
                            }
                        }
                    }
                    
                    Label_0903:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-402346718))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1265899274))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(329230238))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1011016765))
                        var_11_EB = and:int(ldc:int(4842), ldc:int(-4843))
                    }
                    
                    Label_1045:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2092862295))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0903)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1113523106))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1779178548))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1892027991))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1289)
                            }
                        }
                    }
                    
                    Label_1152:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(912126820))
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(433378418))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1045)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0903)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(794490363))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1730574123))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(4450903))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(2026045043))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1445)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1494144214))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2122969290))
                        goto(Label_1045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-712125890))
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2104915647))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1711905045))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1104023508))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(358628308))
                        loopcontinue()
                    }
                    
                    var_3_608 = and:int(var_3_608:int, ldc:int(-527560793))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1445:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_613 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1456:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1045)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2078671628))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1843096383))
                        var_17_613 = add:int(var_16_119:int, and:int(ldc:int(1161), ldc:int(16643)))
                        looporswitchbreak()
                    }
                    
                    var_3_608 = and:int(var_3_608:int, ldc:int(343269071))
                }
                
                var_3_608 = and:int(var_3_608:int, ldc:int(-726365201))
                
                if (cmple:boolean(var_5_85 = var_17_613:int, sub:int(var_6_8C:int, xor:int(ldc:int(20740), ldc:int(20741))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
            var_3_608 = and:int(var_3_608:int, ldc:int(783662465))
            goto(Label_0106)
        }
    }
}
