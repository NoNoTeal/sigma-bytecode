public class \u494c\u4975\ua068\u0c95\uc84e.\u5245\u8389\uceb8\u51b2\u3d64\u4c04 {
    public void \u5245\u8389\uceb8\u51b2\u3d64\u4c04(float[] p0) {
        var_4_7B : int
        var_5_B0 : int
        
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
            invokespecial:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::<init>, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\uae5d\u6c52\u3bd6\u9255\u4bc8\u647c, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(-16460), ldc:int(16459)))
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u6c56\u4d85\u5245\u7043\u5140, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(25603), ldc:int(4357)))
            var_4_7B = arraylength:int(p0:float[])
            putfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, newarray:float[](float.class, var_4_7B:int))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(-1.4E-45f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ub102\u4c04\u47c2\u67d0\ud523\u5db4, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(-1.4E-45f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(3.4028235E38f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u64f2\uc2e8\u392e\ubefe\u71f1, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(3.4028235E38f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua6bd\u93a2\uc4d2\u61a4\uf995\u600f, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(3.4028235E38f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ubb2b\uc2bd\ub18d\u8413\u6b0d\u3a62, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(3.4028235E38f))
            var_5_B0 = and:int(ldc:int(9441), ldc:int(-30190))
            
            while (cmplt:boolean(var_5_B0:int, var_4_7B:int)) {
                storeelement:float(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04), var_5_B0:int, loadelement:float(p0:float[], var_5_B0:int))
                
                if (cmpne:boolean(rem:int(var_5_B0:int, xor:int(ldc:int(1089), ldc:int(1091))), ldc:int(0))) {
                    if (cmpgt:boolean(loadelement:float(p0:float[], var_5_B0:int), getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ub102\u4c04\u47c2\u67d0\ud523\u5db4, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                        putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ub102\u4c04\u47c2\u67d0\ud523\u5db4, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, loadelement:float(p0:float[], var_5_B0:int))
                    }
                    
                    if (cmplt:boolean(loadelement:float(p0:float[], var_5_B0:int), getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u64f2\uc2e8\u392e\ubefe\u71f1, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                        putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u64f2\uc2e8\u392e\ubefe\u71f1, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, loadelement:float(p0:float[], var_5_B0:int))
                    }
                    
                    if (cmplt:boolean(loadelement:float(p0:float[], var_5_B0:int), getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ubb2b\uc2bd\ub18d\u8413\u6b0d\u3a62, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                        putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ubb2b\uc2bd\ub18d\u8413\u6b0d\u3a62, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, loadelement:float(p0:float[], var_5_B0:int))
                    }
                }
                else {
                    if (cmpgt:boolean(loadelement:float(p0:float[], var_5_B0:int), getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                        putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, loadelement:float(p0:float[], var_5_B0:int))
                    }
                    
                    if (cmplt:boolean(loadelement:float(p0:float[], var_5_B0:int), getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                        putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, loadelement:float(p0:float[], var_5_B0:int))
                    }
                    
                    if (cmplt:boolean(loadelement:float(p0:float[], var_5_B0:int), getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua6bd\u93a2\uc4d2\u61a4\uf995\u600f, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                        putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua6bd\u93a2\uc4d2\u61a4\uf995\u600f, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, loadelement:float(p0:float[], var_5_B0:int))
                    }
                }
                
                inc:int(var_5_B0, ldc:int(1))
            }
            
            invokevirtual:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\ubcb0\uc3e3\u1187\uf9c5\u9a18\u5245, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
            invokevirtual:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\u4bc8\u0800\u4e72\uf995\u416d\u4ab3, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8bb0\ud36e\u6b0d\ub18d\u72f1\u5d20, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(2323), ldc:int(1185)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5245\u8389\uceb8\u51b2\u3d64\u4c04() {
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
            invokespecial:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::<init>, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\uae5d\u6c52\u3bd6\u9255\u4bc8\u647c, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(14421), ldc:int(-30814)))
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u6c56\u4d85\u5245\u7043\u5140, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, xor:int[expected:boolean](ldc:int(16388), ldc:int(16389)))
            putfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, newarray:float[](float.class, and:int(ldc:int(14984), ldc:int(-31433))))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(-1.4E-45f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ub102\u4c04\u47c2\u67d0\ud523\u5db4, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(-1.4E-45f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(3.4028235E38f))
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u64f2\uc2e8\u392e\ubefe\u71f1, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, ldc:float(3.4028235E38f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc238\u965f\ua3b4\ub1b9\ubded\u8df4(boolean p0) {
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
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\uae5d\u6c52\u3bd6\u9255\u4bc8\u647c, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5140\u927d\u760c\ud171\u8350\u9a18(float p0, float p1) {
        var_3_5F : int
        var_3_6D : int
        var_5_75 : ArrayList<Float>
        var_6_7E : int
        var_3_175 : int
        var_6_CD : int
        var_7_DE : int
        
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
        var_3_5F = and:int(ldc:int(864221214), ldc:int(-1546130873))
        
        if (logicaland:boolean(invokevirtual:boolean(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\ub1b9\u600f\u6ec6\u56bd\u8cae\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c], p0:float, p1:float), logicalnot:boolean(getfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\uae5d\u6c52\u3bd6\u9255\u4bc8\u647c, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)))) {
            return:void()
        }
        
        var_3_6D = and:int(var_3_5F:int, ldc:int(-37041290))
        var_5_75 = initobject:ArrayList<Float>(ArrayList<E>::<init>)
        var_6_7E = and:int(ldc:int(4529), ldc:int(-4530))
        
        while (cmplt:boolean(var_6_7E:int, arraylength:int(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)))) {
            invokevirtual:boolean(ArrayList<Float>::add, var_5_75:ArrayList<Float>, initobject:Float(Float::<init>, loadelement:float(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04), var_6_7E:int)))
            inc:int(var_6_7E, ldc:int(1))
        }
        
        var_3_175 = and:int(var_3_6D:int, ldc:int(-103921089))
        invokevirtual:boolean(ArrayList<Float>::add, var_5_75:ArrayList<Float>, initobject:Float(Float::<init>, p0:float))
        invokevirtual:boolean(ArrayList<Float>::add, var_5_75:ArrayList<Float>, initobject:Float(Float::<init>, p1:float))
        var_6_CD = invokevirtual:int(ArrayList<E>::size, var_5_75:ArrayList<Float>)
        putfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, newarray:float[](float.class, var_6_CD:int))
        var_7_DE = and:int(ldc:int(-758), ldc:int(721))
        
        while (cmplt:boolean(var_7_DE:int, var_6_CD:int)) {
            storeelement:float(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04), var_7_DE:int, invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Float(ArrayList<Float>::get, var_5_75:ArrayList<Float>, var_7_DE:int))))
            inc:int(var_7_DE, ldc:int(1))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_3_175:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0413)
            }
            
            if (cmpeq:boolean(and:int(var_3_175:int, ldc:int(2048)), ldc:int(0))) {
                var_3_175 = and:int(var_3_175:int, ldc:int(775557823))
                goto(Label_0362)
            }
            
            if (cmpne:boolean(and:int(var_3_175:int, ldc:int(134217728)), ldc:int(0))) {
                var_3_175 = and:int(var_3_175:int, ldc:int(-437144250))
            }
            else {
                var_3_175 = and:int(var_3_175:int, ldc:int(798910586))
                
                if (cmpgt:boolean(p0:float, getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                    putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ua562\u4179\ua3b4\u5245\uc9f6\u8c8a, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, p0:float)
                }
            }
            
            Label_0319:
            
            if (cmpeq:boolean(and:int(var_3_175:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0413)
            }
            
            if (cmpne:boolean(and:int(var_3_175:int, ldc:int(1024)), ldc:int(0))) {
                var_3_175 = and:int(var_3_175:int, ldc:int(-994910080))
            }
            else {
                if (cmpne:boolean(and:int(var_3_175:int, ldc:int(32)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_175 = and:int(var_3_175:int, ldc:int(-2434566))
                
                if (cmpgt:boolean(p1:float, getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ub102\u4c04\u47c2\u67d0\ud523\u5db4, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                    putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\ub102\u4c04\u47c2\u67d0\ud523\u5db4, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, p1:float)
                }
            }
            
            Label_0362:
            
            if (cmpeq:boolean(and:int(var_3_175:int, ldc:int(16384)), ldc:int(0))) {
                var_3_175 = and:int(var_3_175:int, ldc:int(1007787671))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_175:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0319)
                }
                
                if (cmpne:boolean(and:int(var_3_175:int, ldc:int(256)), ldc:int(0))) {
                    var_3_175 = and:int(var_3_175:int, ldc:int(850979507))
                    loopcontinue()
                }
                
                var_3_175 = and:int(var_3_175:int, ldc:int(-1215082813))
                
                if (cmplt:boolean(p0:float, getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
                    putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u69d9\ud158\u3d4b\ubcb0\u12b2\ud217, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, p0:float)
                }
            }
            
            Label_0413:
            
            if (cmpne:boolean(and:int(var_3_175:int, ldc:int(1024)), ldc:int(0))) {
                var_3_175 = and:int(var_3_175:int, ldc:int(-1393704428))
                goto(Label_0362)
            }
            
            if (cmpeq:boolean(and:int(var_3_175:int, ldc:int(131072)), ldc:int(0))) {
                var_3_175 = and:int(var_3_175:int, ldc:int(-1779440506))
                goto(Label_0319)
            }
            
            if (cmpne:boolean(and:int(var_3_175:int, ldc:int(536870912)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_3_175 = and:int(var_3_175:int, ldc:int(-662303921))
        }
        
        if (cmplt:boolean(p1:float, getfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u64f2\uc2e8\u392e\ubefe\u71f1, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))) {
            putfield:float(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u64f2\uc2e8\u392e\ubefe\u71f1, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, p1:float)
        }
        
        invokevirtual:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\ubcb0\uc3e3\u1187\uf9c5\u9a18\u5245, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
        invokevirtual:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\u4bc8\u0800\u4e72\uf995\u416d\u4ab3, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
        putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8bb0\ud36e\u6b0d\ub18d\u72f1\u5d20, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(21), ldc:int(8225)))
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u34df\u7d52\u7049\u5140\ucfaf\ub70c \u494c\u97e6\u7006\ub83f\u446c\uff55(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uff55\u873d\ubded\u759a\u9255\uc229 p0) {
        var_4_6B : \u5245\u8389\uceb8\u51b2\u3d64\u4c04
        var_5_74 : float[]
        
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
            invokevirtual:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\u4975\uc87f\ub1b9\u1833\ub102\ub8be, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
            var_4_6B = initobject:\u5245\u8389\uceb8\u51b2\u3d64\u4c04(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::<init>)
            var_5_74 = newarray:float[](float.class, arraylength:int(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)))
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, p0:\uff55\u873d\ubded\u759a\u9255\uc229, getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04), and:int(ldc:int(28036), ldc:int(-28549)), var_5_74:float[], and:int(ldc:int(-12071), ldc:int(3366)), div:int(arraylength:int(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)), xor:int(ldc:int(773), ldc:int(775))))
            putfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, var_4_6B:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, var_5_74:float[])
            invokevirtual:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\ubcb0\uc3e3\u1187\uf9c5\u9a18\u5245, var_4_6B:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u6c56\u4d85\u5245\u7043\u5140, var_4_6B:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, getfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u6c56\u4d85\u5245\u7043\u5140, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))
            return:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(var_4_6B:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c])
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u93a2\u3dd3\u6cfe\u647c\u4daf(float p0) {
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
            invokespecial:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\ud523\u93a2\u3dd3\u6cfe\u647c\u4daf, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c], p0:float)
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8bb0\ud36e\u6b0d\ub18d\u72f1\u5d20, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(4976), ldc:int(-4978)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub171\u88c5\uceb8\ua61f\u836c\u5245(float p0) {
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
            invokespecial:void(\u34df\u7d52\u7049\u5140\ucfaf\ub70c::\ub171\u88c5\uceb8\ua61f\u836c\u5245, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:\u34df\u7d52\u7049\u5140\ucfaf\ub70c], p0:float)
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8bb0\ud36e\u6b0d\ub18d\u72f1\u5d20, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, and:int[expected:boolean](ldc:int(1490), ldc:int(-1491)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u71f1\u6bb9\ud4fe\u6b5f\u3504() {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u946b\uc229\uff55\ua3b4\u965f\u98a4() {
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
            return:boolean(getfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u6c56\u4d85\u5245\u7043\u5140, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04))
        }
        
        goto(Label_0006)
    }
    
    public void \u7c6b\u446c\u4492\u6b0d\u647c\u8df4(boolean p0) {
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
            putfield:boolean(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u8389\u6c56\u4d85\u5245\u7043\u5140, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u5245\u8389\uceb8\u51b2\u3d64\u4c04 \u8640\u7d52\u7ce1\u600f\ubefe\u4c04() {
        var_3_67 : float[]
        
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
            var_3_67 = newarray:float[](float.class, arraylength:int(getfield:float[](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04)))
            invokestatic:void(System::arraycopy, getfield:float[][expected:Object](\u5245\u8389\uceb8\u51b2\u3d64\u4c04::\u983f\u983f\u3e2a\u8350\u4f52\u16f6, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04), and:int(ldc:int(21376), ldc:int(-21377)), var_3_67:float[][expected:Object], and:int(ldc:int(-26105), ldc:int(17880)), arraylength:int(var_3_67:float[]))
            return:\u5245\u8389\uceb8\u51b2\u3d64\u4c04(initobject:\u5245\u8389\uceb8\u51b2\u3d64\u4c04(\u5245\u8389\uceb8\u51b2\u3d64\u4c04::<init>, var_3_67:float[]))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\u965f\ufcaf\uae5d\u3e2a\u8640(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_657 : int
        
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
        var_3_64C = and:int(ldc:int(713000658), ldc:int(1195347496))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5245\u8389\uceb8\u51b2\u3d64\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
            var_3_64C = and:int(var_3_64C:int, ldc:int(-950028663))
            var_5_7D = and:int(ldc:int(-26264), ldc:int(9351))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20426), ldc:int(3976)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_64C:int, ldc:int(-3147956))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-20448), ldc:int(-20447)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(33), ldc:int(2441)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_64C = and:int(var_3_CA:int, ldc:int(1210043939))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2563), ldc:int(129)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1910029669))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(793126455))
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1142743875))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(169194358))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(74443247))
                    }
                    else {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1591761393))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-259890422))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(302624710))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1883016116))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(457302298))
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1020265649))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-874755338))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1697675049))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(823447859))
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1623226579))
                        var_11_DB = and:int(ldc:int(-2172), ldc:int(2105))
                        goto(Label_1486)
                    }
                    
                    Label_0582:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1463094448))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-623233022))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-523659209))
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1081304810))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(2097131290))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(617006057))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-38603208))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(710009943))
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(303977459))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1988128934))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1869863436))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1802772773))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-818838382))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1471799334))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-914041549))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-2049081298))
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1458590072))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(40), ldc:int(41))
                                goto(Label_1133)
                            }
                        }
                    }
                    
                    Label_0962:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1791636083))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-586648204))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1354277416))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1491552005))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-1093372182))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1492698004))
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1227871974))
                        var_11_DB = and:int(ldc:int(19808), ldc:int(-20321))
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-435932844))
                            goto(Label_0962)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(2129914024))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-629153874))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1084897656))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1133)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(-309052590))
                            goto(Label_0962)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1210758200))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64C = and:int(var_3_64C:int, ldc:int(1771026273))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1353:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1625414508))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(365666903))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1847056521))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-1253927927))
                        loopcontinue()
                    }
                    
                    var_3_64C = and:int(var_3_64C:int, ldc:int(-40900996))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_657 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(868082320))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(34976718))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-323004373))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(-102730181))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64C = and:int(var_3_64C:int, ldc:int(1501529969))
                        var_17_657 = add:int(var_16_109:int, and:int(ldc:int(26629), ldc:int(249)))
                        looporswitchbreak()
                    }
                    
                    var_3_64C = and:int(var_3_64C:int, ldc:int(-1144023820))
                }
                
                var_3_64C = and:int(var_3_64C:int, ldc:int(1866450453))
                
                if (cmple:boolean(var_5_7D = var_17_657:int, sub:int(var_6_84:int, and:int(ldc:int(1065), ldc:int(5))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_64C:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
