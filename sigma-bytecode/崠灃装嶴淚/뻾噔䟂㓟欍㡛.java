public class \u5d20\u7043\u88c5\u5db4\uf94d.\ubefe\u5654\u47c2\u34df\u6b0d\u385b {
    public void \ubefe\u5654\u47c2\u34df\u6b0d\u385b(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc29a\ubefe\u494c\u8640\u34df\ua562 p0) {
        var_4_88 : PointerBuffer
        var_5_9F : int
        var_6_BD : long
        
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
            invokespecial:Object(Object::<init>, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b)
            putfield:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b, initobject:Long2ObjectOpenHashMap[expected:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>](Long2ObjectOpenHashMap::<init>))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            putfield:\uc29a\ubefe\u494c\u8640\u34df\ua562(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u98a4\u6198\u99f7\u71ae\uc2e8\ub113, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b, p0:\uc29a\ubefe\u494c\u8640\u34df\ua562)
            invokestatic:GLFWMonitorCallback(GLFW::glfwSetMonitorCallback, invokedynamic:GLFWMonitorCallbackI(invoke:(L\u5d20\u7043\u88c5\u5db4\uf94d/\ubefe\u5654\u47c2\u34df\u6b0d\u385b;)Lorg/lwjgl/glfw/GLFWMonitorCallbackI;, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b))
            var_4_88 = invokestatic:PointerBuffer(GLFW::glfwGetMonitors)
            
            if (cmpne:boolean(var_4_88:PointerBuffer, aconstnull:PointerBuffer())) {
                var_5_9F = and:int(ldc:int(-22466), ldc:int(21696))
                
                while (cmplt:boolean(var_5_9F:int, invokevirtual:int(PointerBuffer::limit, var_4_88:PointerBuffer))) {
                    var_6_BD = invokevirtual:long(PointerBuffer::get, var_4_88:PointerBuffer, var_5_9F:int)
                    invokeinterface:Object(Long2ObjectMap::put, getfield:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b), var_6_BD:long, invokeinterface:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\uc29a\ubefe\u494c\u8640\u34df\ua562::\u6fb0\ucb79\u3bd6\uc910\u76bc\u156b, p0:\uc29a\ubefe\u494c\u8640\u34df\ua562, var_6_BD:long))
                    inc:int(var_5_9F, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ubb2b\u34df\ua3b4\u8cae\ub18d\u67e9(long p0, int p1) {
        var_4_61 : int
        
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
            var_4_61 = and:int(ldc:int(-495685597), ldc:int(-875176017))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            
            if (cmpne:boolean(p1:int, ldc:int(262145))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-669025925))
                
                if (cmpeq:boolean(p1:int, ldc:int(262146))) {
                    invokeinterface:Object(Long2ObjectMap::remove, getfield:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b), p0:long)
                }
            }
            else {
                invokeinterface:Object(Long2ObjectMap::put, getfield:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b), p0:long, invokeinterface:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f[expected:Object](\uc29a\ubefe\u494c\u8640\u34df\ua562::\u6fb0\ucb79\u3bd6\uc910\u76bc\u156b, getfield:\uc29a\ubefe\u494c\u8640\u34df\ua562(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u98a4\u6198\u99f7\u71ae\uc2e8\ub113, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b), p0:long))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f \u3711\uc31c\u98a4\u9937\u446c\ua3b4(long p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            return:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(checkcast:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f.class, invokeinterface:Object[expected:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f](Long2ObjectMap::get, getfield:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b), p0:long)))
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f \u3711\uc31c\u98a4\u9937\u446c\ua3b4(\u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd p0) {
        var_4_67 : long
        var_6_79 : int
        var_7_82 : int
        var_8_88 : int
        var_9_91 : int
        var_10_94 : int
        var_11_97 : \u52d3\u34df\u4daf\u7af6\u873d\u7e3f
        var_12_A7 : ObjectIterator
        var_13_D9 : \u52d3\u34df\u4daf\u7af6\u873d\u7e3f
        var_14_E0 : int
        var_15_ED : int
        var_16_F4 : int
        var_17_101 : int
        var_24_156 : int
        
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
        var_4_67 = invokestatic:long(GLFW::glfwGetWindowMonitor, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        
        if (cmpeq:boolean(var_4_67:long, ldc:long(0L))) {
            var_6_79 = invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3d64\u8753\u56bd\uf995\u8640\u960f, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
            var_7_82 = add:int(var_6_79:int, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc910\u0c95\u5d20\u6435\ucfaf\u836c, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            var_8_88 = invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ub7dc\u71ae\u6198\u64f2\u98a4\u8d90, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
            var_9_91 = add:int(var_8_88:int, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, p0:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            var_10_94 = ldc:int(-1)
            var_11_97 = aconstnull:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f()
            var_12_A7 = invokeinterface:ObjectIterator(ObjectCollection::iterator, invokeinterface:ObjectCollection(Long2ObjectMap::values, getfield:Long2ObjectMap<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u8d98\u47c2\u12cb\ubcb0\ucef1\u8258, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b)))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_12_A7:ObjectIterator)) {
                var_13_D9 = checkcast:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f.class, invokeinterface:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(Iterator<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>::next, var_12_A7:Iterator<\u52d3\u34df\u4daf\u7af6\u873d\u7e3f>))
                var_14_E0 = invokevirtual:int(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u392e\ucfaf\u47c2\u4daf\u8c8a\ud36e, var_13_D9:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f)
                var_15_ED = add:int(var_14_E0:int, invokevirtual:int(\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae::\u9033\u156b\u4f52\uc7fe\u4daf\u4975, invokevirtual:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\ub18d\u9af2\ub32d\ubff1\u4c04\u6cfe, var_13_D9:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f)))
                var_16_F4 = invokevirtual:int(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u56bd\u9a18\u16f6\u8c8a\uf94d\u3d64, var_13_D9:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f)
                var_17_101 = add:int(var_16_F4:int, invokevirtual:int(\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae::\u4d85\u3c25\uc29a\u6d99\u873d\u4e72, invokevirtual:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\ub18d\u9af2\ub32d\ubff1\u4c04\u6cfe, var_13_D9:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f)))
                var_24_156 = mul:int(invokestatic:int(Math::max, and:int(ldc:int(4695), ldc:int(-4696)), sub:int(invokestatic:int(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u6d69\u718f\u4f52\uceb8\uc229\uf94d, var_7_82:int, var_14_E0:int, var_15_ED:int), invokestatic:int(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u6d69\u718f\u4f52\uceb8\uc229\uf94d, var_6_79:int, var_14_E0:int, var_15_ED:int))), invokestatic:int(Math::max, and:int(ldc:int(-4518), ldc:int(4485)), sub:int(invokestatic:int(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u6d69\u718f\u4f52\uceb8\uc229\uf94d, var_9_91:int, var_16_F4:int, var_17_101:int), invokestatic:int(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u6d69\u718f\u4f52\uceb8\uc229\uf94d, var_8_88:int, var_16_F4:int, var_17_101:int))))
                
                if (cmple:boolean(var_24_156:int, var_10_94:int)) {
                    loopcontinue()
                }
                
                var_11_97 = var_13_D9:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f
                var_10_94 = var_24_156:int
            }
            
            return:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(var_11_97:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f)
        }
        
        return:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(invokevirtual:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u3711\uc31c\u98a4\u9937\u446c\ua3b4, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b, var_4_67:long))
    }
    
    public static int \u6d69\u718f\u4f52\uceb8\uc229\uf94d(int p0, int p1, int p2) {
        var_3_89 : int
        stack_A1_0 : int [generated]
        
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
        var_3_89 = and:int(ldc:int(-1961385556), ldc:int(-892443729))
        
        if (cmpge:boolean(p0:int, p1:int)) {
            loop {
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(-1642175571))
                    
                    if (cmpgt:boolean(p0:int, p2:int)) {
                        stack_A1_0 = p2:int
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(2)), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(-1201723460))
                    stack_A1_0 = p0:int
                    looporswitchbreak()
                }
                
                var_3_89 = and:int(var_3_89:int, ldc:int(1034734257))
            }
            
            return:int(stack_A1_0:int)
        }
        
        return:int(p1:int)
    }
    
    public void \ub7dc\u759a\u3776\u392e\u3d4b\u3dd3() {
        var_3_6F : GLFWMonitorCallback
        
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            var_3_6F = invokestatic:GLFWMonitorCallback(GLFW::glfwSetMonitorCallback, checkcast:GLFWMonitorCallbackI(org.lwjgl.glfw.GLFWMonitorCallbackI.class, aconstnull:GLFWMonitorCallbackI()))
            
            if (cmpne:boolean(var_3_6F:GLFWMonitorCallback, aconstnull:GLFWMonitorCallback())) {
                invokevirtual:void(GLFWMonitorCallback::free, var_3_6F:GLFWMonitorCallback)
            }
            
            return:void()
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
    
    public void \u67d0\u600f\u3bc9\u61a4\ud7e8\u0a06(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_86 : int
        var_6_8D : int
        var_7_9C : double
        var_9_CD : double
        var_3_DF : int
        var_11_F0 : int
        var_14_11A : double
        var_16_11E : int
        var_12_116 : double
        var_17_69D : int
        
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
        var_3_692 = and:int(ldc:int(189640899), ldc:int(1004517606))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubefe\u5654\u47c2\u34df\u6b0d\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0176)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(1534519647))
        }
        else {
            var_3_692 = and:int(var_3_692:int, ldc:int(-1544687217))
            var_5_86 = and:int(ldc:int(294), ldc:int(-295))
            var_6_8D = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9C = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32652), ldc:int(14474)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DF = and:int(var_3_692:int, ldc:int(-1008862021))
                    var_9_CD = sub:double(var_7_9C:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F0 = var_5_86:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F0:int, sub:int(var_6_8D:int, xor:int(ldc:int(2304), ldc:int(2305)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F0:int, xor:int(ldc:int(17442), ldc:int(17443)))), var_7_9C:double))) {
                        inc:int(var_11_F0, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_DF:int, ldc:int(860879323))
                    var_14_11A = var_7_9C:double
                    var_16_11E = var_11_F0:int
                }
                else {
                    var_11_F0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_86:int), and:int(ldc:int(279), ldc:int(19593)))
                    var_12_116 = var_14_11A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_86)
                    
                    if (cmplt:boolean(var_16_11E = var_11_F0:int, var_6_8D:int)) {
                        var_9_CD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F0:int)
                        var_16_11E = var_11_F0:int
                        var_14_11A = var_12_116:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1065978931))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1537674677))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1015089201))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1804750600))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0616)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(632158138))
                    }
                    else {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-875578905))
                        
                        if (cmplt:boolean(var_16_11E:int, var_6_8D:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0616)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0425:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2053736090))
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-475465451))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1876385891))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-915482117))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-600297582))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(195080079))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(2098946056))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2015364106))
                        var_11_F0 = and:int(ldc:int(-8487), ldc:int(8486))
                        goto(Label_1558)
                    }
                    
                    Label_0616:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1701470231))
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(596610645))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(593499155))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(1666053103))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11A = var_9_CD:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-794733339))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1574097698))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1058390199))
                            goto(Label_0616)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-2085039173))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-950030166))
                        var_14_11A = mul:double(ldc:double(0.5), add:double(var_9_CD:double, var_14_11A:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1702780254))
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1993398441))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1438701114))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1829992069))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0616)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1751243003))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1813136982))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_86:int), var_7_9C:double)) {
                                var_11_F0 = and:int(ldc:int(593), ldc:int(137))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_0994:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1673647596))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1043257298))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-772211819))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0616)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1832530856))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1467419263))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(1734196634))
                        var_11_F0 = and:int(ldc:int(-31093), ldc:int(29044))
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(738962127))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2124982960))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0994)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(35060132))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-477508391))
                            goto(Label_0616)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1358895410))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(191871667))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F0:int, ldc:int(0))) {
                                goto(Label_1422)
                            }
                        }
                    }
                    
                    Label_1296:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(129832296))
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1163)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(214469963))
                            goto(Label_0994)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0616)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1604939144))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(1937748419))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11A:double, var_5_86:int, var_16_11E:int)
                        goto(Label_1558)
                    }
                    
                    Label_1422:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1720684558))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(253813003))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1573560297))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-432461236))
                        goto(Label_0616)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(667792867))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11A:double, ldc:double(0.0))
                    Label_1558:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_86:int
                        
                        if (cmpeq:boolean(var_11_F0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1569:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-143753470))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1680260078))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1485762901))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1947779920))
                        goto(Label_0616)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-471993361))
                        var_17_69D = add:int(var_16_11E:int, and:int(ldc:int(65), ldc:int(14641)))
                        looporswitchbreak()
                    }
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(-1009910529))
                
                if (cmple:boolean(var_5_86 = var_17_69D:int, sub:int(var_6_8D:int, and:int(ldc:int(4943), ldc:int(16513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0176:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(-1280336853))
            goto(Label_0106)
        }
    }
}
